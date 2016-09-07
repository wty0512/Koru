package net.pixelstatic.koru.behaviors.tasks;

import net.pixelstatic.koru.items.Item;

public class HarvestResourceTask extends Task{
	//private final int searchrange = 50;
	//private int quantitygoal = 1; // how many blocks to harvest until it stops
	//private final Item item; // goal item
	//private final boolean usechests;


	public HarvestResourceTask(Item item, int goal, boolean usechests){
		//this.item = item;
		//this.quantitygoal = goal;
		//this.usechests = usechests;
	}
	
	public HarvestResourceTask(Item item, int goal){
		this(item, goal, true);
	}

	@Override
	protected void update(){
		/*
		if(quantitygoal <= 0){
			finish();
			return;
		}
		
		World world = KoruUpdater.instance.world;
		int ex = World.tile(entity.position().x);
		int ey = World.tile(entity.position().y);
		int nearestx = -9999, nearesty = -9999;
		float closest = Float.MAX_VALUE;
		Material selected = null;
		for(int x = -searchrange;x <= searchrange;x ++){
			for(int y = -searchrange;y <= searchrange;y ++){
				int worldx = ex + x, worldy = ey + y;
				if( !World.inBounds(worldx, worldy)) continue;
				Tile tile = world.tiles[worldx][worldy];
				
				if(!world.isAccesible(worldx, worldy)) continue;
				
				if(usechests && tile.blockdata != null && tile.blockdata instanceof InventoryTileData){
					InventoryComponent inventory = tile.getBlockData(InventoryTileData.class).inventory;
					ItemStack stack = new ItemStack(item, quantitygoal);
					if(inventory.hasItem(stack)){
						insertTask(new TakeItemTask(worldx, worldy, stack));
						finish();
						return;
					}
				}
				Material material = tile.block;
				if(tile.block.breakable() && tile.block.dropsItem(item)){
					material = tile.block;
				}else if(tile.tile.breakable() && tile.tile.dropsItem(item) && !tile.block.getType().solid()){
					material = tile.tile;
				}else{
					continue;
				}

				float dist = Vector2.dst(0, 0, x, y);
				if(dist < closest && (!entity.group().blockReserved(worldx, worldy) || !material.reserved()) 
						&& !entity.group().isBaseBlock(material, worldx, worldy)){
					nearestx = x;
					nearesty = y;
					closest = dist;
					selected = material;
				}
			}
		}
		if(nearestx == -9999 || nearesty == -9999 || selected == null){
			Koru.log("failed: " + item + " not found");
			finish();
			return;
		}
		for(ItemStack stack :  selected.getDrops()){
			if(stack.item == item){
				quantitygoal -= stack.amount;
				break;
			}
		}
		
		int targetx = ex + nearestx;
		int targety = ey + nearesty;
		if(selected.reserved())entity.group().reserveBlock(targetx, targety);
		this.insertTask(new BreakBlockTask(selected, targetx, targety));
	*/
	}
}