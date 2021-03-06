package gregtech.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.IStringSerializable;

public class BlockTurbineCasing extends VariantBlock<BlockTurbineCasing.TurbineCasingType> {

    public BlockTurbineCasing() {
        super(Material.IRON);
        setUnlocalizedName("turbine_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(TurbineCasingType.BRONZE_GEARBOX));
    }

    public enum TurbineCasingType implements IStringSerializable {

        BRONZE_GEARBOX("bronze_gearbox"),
        STEEL_GEARBOX("steel_gearbox"),
        TITANIUM_GEARBOX("titanium_gearbox"),

        STEEL_TURBINE_CASING("steel_turbine_casing"),
        TITANIUM_TURBINE_CASING("titanium_turbine_casing"),
        STAINLESS_TURBINE_CASING("stainless_turbine_casing"),
        TUNGSTENSTEEL_TURBINE_CASING("tungstensteel_turbine_casing");

        private final String name;

        TurbineCasingType(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }

    }

}
