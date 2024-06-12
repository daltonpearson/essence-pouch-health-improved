package bbp.essencepouchhealth;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class EssencePouchHealthPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(EssencePouchHealthPlugin.class);
		RuneLite.main(args);
	}
}