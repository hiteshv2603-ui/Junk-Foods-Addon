package name.modid;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModItems {

    public static final FoodProperties
CHIPS_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.2f).build();

    public static final FoodProperties
CHEESECAKE_FOOD = new FoodProperties.Builder()

.nutrition(10).saturationModifier(0.8f).build();

    public static final FoodProperties
CHOCOLATECAKE_FOOD = new FoodProperties.Builder()

.nutrition(10).saturationModifier(0.8f).build();

    public static final FoodProperties
MATCHACAKE_FOOD = new FoodProperties.Builder()

.nutrition(10).saturationModifier(0.8f).build();

    public static final FoodProperties
REDVELVETCAKE_FOOD = new FoodProperties.Builder()

.nutrition(10).saturationModifier(0.8f).build();

    public static final FoodProperties
STRAWBERRYCAKE_FOOD = new FoodProperties.Builder()

.nutrition(10).saturationModifier(0.8f).build();

    public static final FoodProperties
SOUP_FOOD = new FoodProperties.Builder()

.nutrition(10).saturationModifier(0.8f).build();

    public static final FoodProperties
BLUEPOPSICLE_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.4f).build();

    public static final FoodProperties
GREENPOPSICLE_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.4f).build();

    public static final FoodProperties
PINKPOPSICLE_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.4f).build();

    public static final FoodProperties
YELLOWPOPSICLE_FOOD = new FoodProperties.Builder()

.nutrition(3).saturationModifier(0.4f).build();

    public static final FoodProperties
SOYMILKALMOND_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties
SOYMILKBANANA_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties
SOYMILKCHOCOLATE_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties
SOYMILKCHOCOMINT_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties
SOYMILKCOFFEE_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties
SOYMILKMANGO_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties
MATCHA_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties
SOYMILKPEACH_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties
SOYMILK_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties
SOYMILKSTRAWBERRY_FOOD = new FoodProperties.Builder()

.nutrition(4).saturationModifier(0.5f).build();

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
    public static final Item COFFEE = register("coffee", new Item.Properties()
            .food(COFFEE_FOOD, Consumables.defaultDrink()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.HASTE, 600, 0)))
                    .build()));
    public static final Item CROISSANT = register("croissant", new
Item.Properties().food(CROISSANT_FOOD));
    public static final Item GRAPE = register("grape", new
Item.Properties().food(GRAPE_FOOD));
    public static final Item KIWI = register("kiwi", new
Item.Properties().food(KIWI_FOOD));
    public static final Item LEMON = register("lemon", new Item.Properties()
            .food(LEMON_FOOD, Consumables.defaultFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.NAUSEA, 60, 0)))
                    .build()));
    public static final Item ONIGIRI = register("onigiri", new
Item.Properties().food(ONIGIRI_FOOD));
    public static final Item ORANGE = register("orange", new
Item.Properties().food(ORANGE_FOOD));
    public static final Item PEACH = register("peach", new
Item.Properties().food(PEACH_FOOD));
    public static final Item POPSICLE = register("popsicle", new Item.Properties()
            .food(POPSICLE_FOOD, Consumables.defaultFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.SLOWNESS, 60, 0)))
                    .build()));
    public static final Item PRETZEL = register("pretzel", new
Item.Properties().food(PRETZEL_FOOD));
    public static final Item STRAWBERRY = register("strawberry", new
Item.Properties().food(STRAWBERRY_FOOD));
    public static final Item BOBA = register("boba", new
Item.Properties().food(BOBA_FOOD));
    public static final Item CHEESECAKE = register("cheesecake", new
Item.Properties().food(CHEESECAKE_FOOD));
    public static final Item CHOCOLATECAKE = register("chocolate_cake", new
Item.Properties().food(CHOCOLATECAKE_FOOD));
    public static final Item MATCHACAKE = register("matcha_cake", new
Item.Properties().food(MATCHACAKE_FOOD));
    public static final Item REDVELVETCAKE = register("red_velvet_cake", new
Item.Properties().food(REDVELVETCAKE_FOOD));
    public static final Item STRAWBERRYCAKE = register("strawberry_cake", new
Item.Properties().food(STRAWBERRYCAKE_FOOD));
    public static final Item SOUP = register("soup", new
Item.Properties().food(SOUP_FOOD));
     public static final Item BLUEPOPSICLE = register("blue_popsicle", new Item.Properties()
            .food(BLUEPOPSICLE_FOOD, Consumables.defaultFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.SLOWNESS, 60, 0)))
                    .build()));
    public static final Item GREENPOPSICLE = register("green_popsicle", new Item.Properties()
            .food(GREENPOPSICLE_FOOD, Consumables.defaultFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.SLOWNESS, 60, 0)))
                    .build()));
    public static final Item PINKPOPSICLE = register("pink_popsicle", new Item.Properties()
            .food(PINKPOPSICLE_FOOD, Consumables.defaultFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.SLOWNESS, 60, 0)))
                    .build()));
    public static final Item YELLOWPOPSICLE = register("yellow_popsicle", new Item.Properties()
            .food(YELLOWPOPSICLE_FOOD, Consumables.defaultFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.SLOWNESS, 60, 0)))
                    .build()));
    public static final Item SOYMILKALMOND = register("almond_soy_milk", new
Item.Properties().food(SOYMILKALMOND_FOOD));
    public static final Item SOYMILKBANANA = register("banana_soy_milk", new
Item.Properties().food(SOYMILKBANANA_FOOD));
    public static final Item SOYMILKCHOCOLATE = register("chocolate_soy_milk", new
Item.Properties().food(SOYMILKCHOCOLATE_FOOD));
    public static final Item SOYMILKCHOCOMINT = register("choco_mint_soy_milk", new
Item.Properties().food(SOYMILKCHOCOMINT_FOOD));
    public static final Item SOYMILKCOFFEE = register("coffee_soy_milk", new
Item.Properties().food(SOYMILKCOFFEE_FOOD));
    public static final Item SOYMILKMANGO = register("mango_soy_milk", new
Item.Properties().food(SOYMILKMANGO_FOOD));
    public static final Item MATCHA = register("matcha", new
Item.Properties().food(MATCHA_FOOD));
    public static final Item SOYMILKPEACH = register("peach_soy_milk", new
Item.Properties().food(SOYMILKPEACH_FOOD));
    public static final Item SOYMILK = register("soy_milk", new
Item.Properties().food(SOYMILK_FOOD));
    public static final Item SOYMILKSTRAWBERRY = register("strawberry_soy_milk", new
Item.Properties().food(SOYMILKSTRAWBERRY_FOOD));
    public static final Item CHEESE = register("cheese", new
Item.Properties().food(CHEESE_FOOD));

    public static final Item ICE_CREAM = register("ice_cream", new
Item.Properties()
            .food(ICE_CREAM_FOOD, Consumables.defaultFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.SLOWNESS, 100, 0)))
                    .build()));
    
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
                Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                ResourceKey.create(Registries.CREATIVE_MODE_TAB, JunkFoodsAddon.id("junk_foods")),
                FabricCreativeModeTab.builder()
                        .title(Component.literal("Junk Foods"))
                        .icon(() -> new ItemStack(BURGER))
                        .displayItems((context, output) -> {
                            for (Item item : BuiltInRegistries.ITEM) {
                                if (BuiltInRegistries.ITEM.getKey(item).getNamespace().equals(JunkFoodsAddon.MOD_ID)) {
                                    output.accept(item);
                                }
                            }
                        })
                        .build());
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
            output.accept(CHEESECAKE);
            output.accept(CHOCOLATECAKE);
            output.accept(MATCHACAKE);
            output.accept(REDVELVETCAKE);
            output.accept(STRAWBERRYCAKE);
            output.accept(SOUP);
            output.accept(BLUEPOPSICLE);
            output.accept(GREENPOPSICLE);
            output.accept(PINKPOPSICLE);
            output.accept(YELLOWPOPSICLE);
            output.accept(SOYMILKALMOND);
            output.accept(SOYMILKBANANA);
            output.accept(SOYMILKCHOCOLATE);
            output.accept(SOYMILKCHOCOMINT);
            output.accept(SOYMILKCOFFEE);
            output.accept(SOYMILKMANGO);
            output.accept(MATCHA);
            output.accept(SOYMILKPEACH);
            output.accept(SOYMILK);
            output.accept(SOYMILKSTRAWBERRY);
            output.accept(CHEESE);
            output.accept(CUPCAKE);
        });
    }
}       
