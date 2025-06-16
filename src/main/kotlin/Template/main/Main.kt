package Template.main

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(), Listener {

    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(this, this)
        logger.info("\n✅ 플러그인이 활성화되었습니다!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
