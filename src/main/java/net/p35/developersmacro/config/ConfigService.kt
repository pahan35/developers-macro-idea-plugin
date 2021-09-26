package net.p35.developersmacro.config

import com.intellij.openapi.components.*
import com.intellij.util.xmlb.XmlSerializerUtil
import java.lang.ref.WeakReference

@State(
        name = "developers-macro",
        storages = [Storage(file ="developers-macro.xml")]
)
class ConfigService : PersistentStateComponent<Config> {
    private val observers : MutableList<WeakReference<() -> Unit>> = arrayListOf()
    private val config = Config()

    override fun getState() = config
    fun onChange(f :() -> Unit) = observers.add(WeakReference(f))

    fun notifyChange() {
        val it = observers.listIterator()
        while(it.hasNext()) {
            val f = it.next().get()

            if (f == null) {
                it.remove()
            } else {
                f()
            }
        }
    }

    override fun loadState(config: Config) {
        XmlSerializerUtil.copyBean(config, this.config)
    }
}