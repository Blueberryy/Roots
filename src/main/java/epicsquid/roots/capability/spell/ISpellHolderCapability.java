package epicsquid.roots.capability.spell;

import epicsquid.roots.capability.ICapability;
import epicsquid.roots.spell.SpellBase;
import epicsquid.roots.spell.modules.SpellModule;

import java.util.List;

public interface ISpellHolderCapability extends ICapability {

    boolean hasSpell();
    boolean hasSpellInSlot();

    int getCooldown();
    void setCooldown(int cooldown);

    int getLastCooldown();
    void setLastCooldown(int cooldown);

    SpellBase getSelectedSpell();

    int getSelectedSlot();
    void setSelectedSlot(int slot);

    void setSpellToSlot(SpellBase spell);

    void addModule(SpellModule module);

    List<SpellModule> getSelectedModules();
}