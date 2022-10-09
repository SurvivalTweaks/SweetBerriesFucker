package com.vjh0107.sweetberriesfucker.listeners

import com.vjh0107.barcode.framework.component.BarcodeComponent
import com.vjh0107.barcode.framework.component.listener.BarcodeListener
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.entity.EntityDamageByBlockEvent

@BarcodeComponent
class SweetBerriesFuckerListener : BarcodeListener {
    @EventHandler
    fun onDamage(event: EntityDamageByBlockEvent) {
        val damager = event.damager ?: return
        if (damager.blockData.material == Material.SWEET_BERRY_BUSH) {
            event.isCancelled = true
        }
    }
}