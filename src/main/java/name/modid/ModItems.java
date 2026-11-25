package name.modid;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModItems {

    public static final FoodProperties
CHIPS_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.2f).build();

    public static final FoodProperties
BURGER_FOOD = new FoodProperties.Builder()

.nutrition(10).saturationModifier(0.8f).build();

    public static final FoodProperties
FRIES_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.3f).build();

    public static final FoodProperties
CUPCAKE_FOOD = new
FoodProperties.Builder()

.nutrition(4).saturationModifier(0.2f).alwaysEdible().build();

    public static final FoodProperties
ICE_CREAM_FOOD = new
FoodProperties.Builder()

.nutrition(4).saturationModifier(0.3f).alwaysEdible().build();

    public static final FoodProperties
SODA_FOOD = new FoodProperties.Builder()

.nutrition(2).saturationModifier(0.1f).alwaysEdible().build();

    public static final Item CHIPS = register("chips", new
Item.Properties().food(CHIPS_FOOD));
    public static final Item BURGER = register("burger", new
Item.Properties().food(BURGER_FOOD));
    public static final Item FRIES = register("fries", new
Item.Properties().food(FRIES_FOOD));
    public static final Item CUPCAKE = register("cupcake", new
Item.Properties().food(CUPCAKE_FOOD_FOOD));

//Below is the code brain freeze effect for the ice cream btw
    public static final Item ICE_CREAM = register("ice_cream", new
Item.Properties()
            .food(ICE_CREAM_FOOD, Consumables.defaultFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.SLOWNESS, 100, 0)))
                    .build()));
    
    //The code below is the sugar rush speed boost for drinking soda
    public static final Item SODA = register("soda", new Item.Properties()
            .stacksTo(16)
            .food(SODA_FOOD, Consumables.defaultDrink()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.SPEED, 200, 0)))
                    .build()));
    
    private static Item register(String name, Item.Properties properties) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, JunkFoodsAddon.id(name));
        return Registry.register(BuiltInRegistries.ITEM, key, new Item(properties.setId(key)));
    }

    // Calling this loads the class, which registers all the items above
    public static void init() {
    }
}                
