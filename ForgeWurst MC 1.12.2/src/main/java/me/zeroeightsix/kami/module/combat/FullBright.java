package me.zeroeightsix.kami.module.combat;

import me.zeroeightsix.kami.module.Mod;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FullBright extends Mod {
    public FullBright() {
        super("Fullbright");
        setEnabled(true);
    }

    @Override
    public void onTick(TickEvent.ClientTickEvent event) {
        mc.gameSettings.gammaSetting = -10;

        if (mc.player != null) {
            if (!mc.player.isPotionActive(MobEffects.NIGHT_VISION) || mc.player.getActivePotionEffect(MobEffects.NIGHT_VISION).getDuration() < 20) {
                mc.player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 200));
            }
        }
    }
}
