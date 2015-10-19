package growthcraft.fishtrap;

import growthcraft.core.ConfigBase;
import net.minecraftforge.common.config.Configuration;

public class Config extends ConfigBase
{
	public float fishTrapCatchRate = 55.0f;
	public boolean useBiomeDict = true;
	public String biomesList = "0;7;24";
	public boolean enableThaumcraftIntegration = true;

	protected void loadConfig()
	{
		this.fishTrapCatchRate = (float)config.get(Configuration.CATEGORY_GENERAL, "Fish Trap catching rate", (double)fishTrapCatchRate, "[Higher -> Slower] Default : " + fishTrapCatchRate).getDouble();
		this.biomesList = config.get(Configuration.CATEGORY_GENERAL, "Biomes (IDs) That Increases Fish Trap Productivity", biomesList, "Separate the IDs with ';' (without the quote marks)").getString();
		this.useBiomeDict = config.get(Configuration.CATEGORY_GENERAL, "Enable Biome Dictionary compatability?", useBiomeDict, "Default : true  || false = Disable").getBoolean();
		this.enableThaumcraftIntegration = config.get(Configuration.CATEGORY_GENERAL, "Enable Thaumcraft Integration", enableThaumcraftIntegration, "Should we integrate with Thaumcraft (if available); Default: " + enableThaumcraftIntegration).getBoolean();
	}
}
