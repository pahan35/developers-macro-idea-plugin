package net.p35.commonenumvalues.config

import com.intellij.openapi.components.*
import com.intellij.util.xmlb.XmlSerializerUtil
import java.lang.ref.WeakReference

@Storage("common-enum-values.xml")
class ConfigService : PersistentStateComponent<Config> {
    private val observers : MutableList<WeakReference<() -> Unit>> = arrayListOf()
    private val config = Config()

    override fun getState(): Config? = config
    public fun onChange(f :() -> Unit) = observers.add(WeakReference<() -> Unit>(f))

    public fun notifyChange() {
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