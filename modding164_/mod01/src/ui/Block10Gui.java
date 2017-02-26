package assets.mod01.src.ui;

import org.lwjgl.opengl.GL11;

import assets.mod01.src.InfoMod;
import assets.mod01.src.containers.Block10Container;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class Block10Gui  extends GuiContainer {

	public Block10Gui(InventoryPlayer invplayer, World world, int i, int j, int k) 
	{
		super(new Block10Container(invplayer, world, i, j, k));
	}
	private ResourceLocation ui4 = new ResourceLocation(InfoMod.MODID + ":ui07.png");
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1f, 1F, 1F, 1F);
		mc.renderEngine.bindTexture(ui4);
		int q = (width - xSize) / 2;
		int ui1 = (height - ySize) / 2;
		drawTexturedModalRect(q, ui1, 0, 0, xSize, ySize);
	}
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
    	this.fontRenderer.drawStringWithShadow(StatCollector.translateToLocal("Nothing"), 50, 5, 0x001266);
    	
    }
	
		
		
	
	
	
	
	public void onGuiClosed(){
		
	}
}
	
	


