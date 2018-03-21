package ms.ralph.minecraft.yukari_s_mod

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.Logger

@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION)
class ModMain {

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.modLog
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        // some example code
        logger!!.info("DIRT BLOCK >> {}", Blocks.DIRT.registryName)
    }

    companion object {
        const val MODID = "examplemod"
        const val NAME = "Example Mod"
        const val VERSION = "1.0"

        private var logger: Logger? = null
    }
}
