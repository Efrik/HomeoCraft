package main.java.pi.homeocraft.core.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{

	public static void registerModel() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
			ModelLoader.
			setCustomModelResourceLocation(item, meta, 
					new ModelResourceLocation(
							item.getRegistryName(),id)
					);
	}

}
