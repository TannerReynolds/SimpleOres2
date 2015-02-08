package alexndr.plugins.Netherrocks;

import java.util.List;

import com.google.common.collect.Lists;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author AleXndrTheGr8st
 */
public class ModInfo 
{
	public static final String ID = "netherrocks";
	public static final String NAME = "Netherrocks";
	public static final String VERSION = "1.2.1";
	public static final String DESCRIPTION = "A plugin for SimpleCore API that adds 6 new ores to the Nether.";
	public static final String URL = "http://bit.ly/SimpleOres";
	public static final List<String> AUTHORS = Lists.newArrayList("AleXndrTheGr8st");
	public static final String CREDITS = "Created by AleXndrTheGr8st.";
	public static final String LOGO = "/assets/simplecore/logos/Netherrocks.png";
	public static final String PARENT = "";
	public static final boolean USEDEPENDENCYINFO = true;
	public static final String VERSIONURL = "https://dl.dropboxusercontent.com/u/66466201/Mods/Netherrocks/Netherrocks%20Plugin%20Version.txt";

	public static void setModInfoProperties(FMLPreInitializationEvent event) {
		event.getModMetadata().autogenerated = false;
		event.getModMetadata().modId = ID;
		event.getModMetadata().name = NAME;
		event.getModMetadata().description = DESCRIPTION;
		event.getModMetadata().version = VERSION;
		event.getModMetadata().url = URL;
		event.getModMetadata().authorList = AUTHORS;
		event.getModMetadata().credits = CREDITS;
		event.getModMetadata().logoFile = LOGO;
		event.getModMetadata().parent = PARENT;
		event.getModMetadata().useDependencyInformation = USEDEPENDENCYINFO;
	}
}