package gregtech.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.IStringSerializable;

public class BlockBoilerCasing extends VariantBlock<BlockBoilerCasing.BoilerCasingType> {

    public BlockBoilerCasing() {
        super(Material.IRON);
        setUnlocalizedName("boiler_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(BoilerCasingType.BRONZE_PIPE));
    }

    public enum BoilerCasingType implements IStringSerializable {

        BRONZE_PIPE("bronze_pipe"),
        STEEL_PIPE("steel_pipe"),
        TITANIUM_PIPE("titanium_pipe"),
        TUNGSTENSTEEL_PIPE("tungstensteel_pipe"),

        BRONZE_FIREBOX("bronze_firebox"),
        STEEL_FIREBOX("steel_firebox"),
        TITANIUM_FIREBOX("titanium_firebox"),
        TUNGSTENSTEEL_FIREBOX("tungstensteel_firebox");

        private final String name;

        BoilerCasingType(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }

    }

}
