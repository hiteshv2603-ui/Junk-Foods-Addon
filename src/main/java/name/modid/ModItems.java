package name.modid;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
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
BANANA_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.2f).build();

    public static final FoodProperties
BLUEBERRY_FOOD = new FoodProperties.Builder()

.nutrition(1).saturationModifier(0.1f).build();

    public static final FoodProperties
COFFEE_FOOD = new FoodProperties.Builder()

.nutrition(2).saturationModifier(0.5f).alwaysEdible().build();

    public static final FoodProperties
CROISSANT_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.2f).alwaysEdible().build();

    public static final FoodProperties
GRAPE_FOOD = new FoodProperties.Builder()

.nutrition(2).saturationModifier(0.2f).alwaysEdible().build();

    public static final FoodProperties
KIWI_FOOD = new FoodProperties.Builder()

.nutrition(2).saturationModifier(0.4f).build();

    public static final FoodProperties
LEMON_FOOD = new FoodProperties.Builder()

.nutrition(1).saturationModifier(0.2f).build();

    public static final FoodProperties
ONIGIRI_FOOD = new FoodProperties.Builder()

.nutrition(5).saturationModifier(0.4f).build();

    public static final FoodProperties
ORANGE_FOOD = new FoodProperties.Builder()

.nutrition(2).saturationModifier(0.4f).build();

    public static final FoodProperties
PEACH_FOOD = new FoodProperties.Builder()

.nutrition(2).saturationModifier(0.4f).build();

    public static final FoodProperties
POPSICLE_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.4f).alwaysEdible().build();

    public static final FoodProperties
PRETZEL_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.5f).alwaysEdible().build();

    public static final FoodProperties
STRAWBERRY_FOOD = new FoodProperties.Builder()

.nutrition(1).saturationModifier(0.1f).alwaysEdible().build();

    public static final FoodProperties
BOBA_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.4f).build();

    public static final FoodProperties
CHEESE_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.3f).alwaysEdible().build();

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
Item.Properties().food(CUPCAKE_FOOD));
    public static final Item BANANA = register("banana", new
Item.Properties().food(BANANA_FOOD));
    public static final Item BLUEBERRY = register("blueberry", new
Item.Properties().food(BLUEBERRY_FOOD));
    public static final Item COFFEE = register("coffee", new
Item.Properties().food(COFFEE_FOOD));
    public static final Item CROISSANT = register("croissant", new
Item.Properties().food(CROISSANT_FOOD));
    public static final Item GRAPE = register("grape", new
Item.Properties().food(GRAPE_FOOD));
    public static final Item KIWI = register("kiwi", new
Item.Properties().food(KIWI_FOOD));
    public static final Item LEMON = register("lemon", new
Item.Properties().food(LEMON_FOOD));
    public static final Item ONIGIRI = register("onigiri", new
Item.Properties().food(ONIGIRI_FOOD));
    public static final Item ORANGE = register("orange", new
Item.Properties().food(ORANGE_FOOD));
    public static final Item PEACH = register("peach", new
Item.Properties().food(PEACH_FOOD));
    public static final Item POPSICLE = register("popsicle", new
Item.Properties().food(POPSICLE_FOOD));
    public static final Item PRETZEL = register("pretzel", new
Item.Properties().food(PRETZEL_FOOD));
    public static final Item STRAWBERRY = register("strawberry", new
Item.Properties().food(STRAWBERRY_FOOD));
    public static final Item BOBA = register("boba", new
Item.Properties().food(BOBA_FOOD));
    public static final Item CHEESE = register("cheese", new
Item.Properties().food(CHEESE_FOOD));

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


    public static void init() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(SODA);
            output.accept(CHIPS);
            output.accept(BURGER);
            output.accept(FRIES);
            output.accept(ICE_CREAM);
            output.accept(BANANA);
            output.accept(BLUEBERRY);
            output.accept(COFFEE);
            output.accept(CROISSANT);
            output.accept(GRAPE);
            output.accept(KIWI);
            output.accept(LEMON);
            output.accept(ONIGIRI);
            output.accept(ORANGE);
            output.accept(PEACH);
            output.accept(POPSICLE);
            output.accept(PRETZEL);
            output.accept(STRAWBERRY);
            output.accept(BOBA);
            output.accept(CHEESE);
            output.accept(CUPCAKE);
        });
    }
}       
