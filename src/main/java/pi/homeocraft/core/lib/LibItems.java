package main.java.pi.homeocraft.core.lib;

import main.java.pi.homeocraft.common.items.FoodBase;
import main.java.pi.homeocraft.common.items.FoodPoison;
import net.minecraft.item.Item;


/*
 *public FoodBase(String name, int amount, float saturation, boolean isWolfFood) 
 * 
 * */
public class LibItems {

	
	public static final Item PREPARATION = new FoodBase("preparation", 0, 0, false);
	public static final Item DILUTION_1C = new FoodBase("dilution_1c", 0, 0, false);
	public static final Item DILUTION_2C = new FoodBase("dilution_2c", 0, 0, false);
	public static final Item DILUTION_3C = new FoodBase("dilution_3c", 0, 0, false);
	public static final Item DILUTION_4C = new FoodBase("dilution_4c", 0, 0, false);
	public static final Item DILUTION_5C = new FoodBase("dilution_5c", 0, 0, false);
	public static final Item RAW_WATER = new FoodPoison("raw_water", 0, 0, false);
	
	public static final Item PILL = new FoodBase("pill", 0, 0, false);
	
	
}
