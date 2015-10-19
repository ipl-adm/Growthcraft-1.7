package growthcraft.cellar;

import growthcraft.core.ConfigBase;
import net.minecraftforge.common.config.Configuration;

public class Config extends ConfigBase
{
	public int potionTipsyID = 50;
	public int villagerBrewerID = 10;
	public int fermentSpeed = 24000;
	public boolean dropItemsInBrewKettle;
	public final int fruitPressMaxCap = 1000;
	public final int fermentBarrelMaxCap = 3000;
	public final int brewKettleMaxCap = 1000;
	public boolean enableThaumcraftIntegration = true;

	protected void loadConfig()
	{
		this.potionTipsyID = config.get("Potions", "Potion Tipsy ID", 50).getInt();
		this.villagerBrewerID = config.get("Villager", "Brewer ID", 10).getInt();
		this.fermentSpeed = config.get(Configuration.CATEGORY_GENERAL, "Ferment Barrel fermenting time", fermentSpeed, "[Higher -> Slower] Default : " + fermentSpeed).getInt();
		this.dropItemsInBrewKettle = config.get(Configuration.CATEGORY_GENERAL, "Drop items in Brew Kettle", dropItemsInBrewKettle, "Enable to have brew kettles pick up dropped items Default :  " + dropItemsInBrewKettle).getBoolean();
		this.enableThaumcraftIntegration = config.get(Configuration.CATEGORY_GENERAL, "Enable Thaumcraft Integration", enableThaumcraftIntegration, "Should we integrate with Thaumcraft (if available); Default: " + enableThaumcraftIntegration).getBoolean();
	}
}
