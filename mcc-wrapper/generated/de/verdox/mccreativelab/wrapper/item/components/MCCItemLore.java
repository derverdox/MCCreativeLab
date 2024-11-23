package de.verdox.mccreativelab.wrapper.item.components;

import java.util.List;
import net.kyori.adventure.text.Component;

public interface MCCItemLore extends MCCItemComponent  {

	public List<Component> getLines();

	public MCCItemLore withLines(List<Component> lines);

	public List<Component> getStyledLines();

	public MCCItemLore withStyledLines(List<Component> styledLines);

}
