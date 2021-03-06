package com.minebarteksa.sonos.items;

import com.minebarteksa.orion.OrionRegistry;
import com.minebarteksa.sonos.blocks.SonosBlocks;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.client.Minecraft;
import net.minecraftforge.oredict.OreDictionary;
import com.minebarteksa.sonos.sound.SoundEvents.Notes;
import com.minebarteksa.sonos.Sonos;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class SonosItems
{
	//Notes color
	public static final int color_c = 0x01ff03;
	public static final int color_cs = 0x01ffbb;
	public static final int color_d = 0x019dff;
	public static final int color_ds = 0x0113ff;
	public static final int color_e = 0x9d01ff;
	public static final int color_f = 0xff01ff;
	public static final int color_fs = 0xff018a;
	public static final int color_g = 0xff0701;
	public static final int color_gs = 0xff5501;
	public static final int color_a = 0xffbb01;
	public static final int color_as = 0xfcff01;
	public static final int color_b = 0xa9ff01;

	//Unworked Sonos
	public static Sono sono_c = new Sono("sono_c", Notes.C, "").setCreativeTab(Sonos.cTab);       //Color HEX int value: 01e603
	public static Sono sono_cs = new Sono("sono_cs", Notes.CSharp, "").setCreativeTab(Sonos.cTab);//Color HEX int value: 01e7a9
	public static Sono sono_d = new Sono("sono_d", Notes.D, "").setCreativeTab(Sonos.cTab);       //Color HEX int value: 018ee7
	public static Sono sono_ds = new Sono("sono_ds", Notes.DSharp, "").setCreativeTab(Sonos.cTab);//Color HEX int value: 0111e7
	public static Sono sono_e = new Sono("sono_e", Notes.E, "").setCreativeTab(Sonos.cTab);       //Color HEX int value: 8e01e7
	public static Sono sono_f = new Sono("sono_f", Notes.F, "").setCreativeTab(Sonos.cTab);       //Color HEX int value: e701e7
	public static Sono sono_fs = new Sono("sono_fs", Notes.FSharp, "").setCreativeTab(Sonos.cTab);//Color HEX int value: e7017d
	public static Sono sono_g = new Sono("sono_g", Notes.G, "").setCreativeTab(Sonos.cTab);       //Color HEX int value: e70601
	public static Sono sono_gs = new Sono("sono_gs", Notes.GSharp, "").setCreativeTab(Sonos.cTab);//Color HEX int value: e74d01
	public static Sono sono_a = new Sono("sono_a", Notes.A, "").setCreativeTab(Sonos.cTab);       //Color HEX int value: e7a901
	public static Sono sono_as = new Sono("sono_as", Notes.ASharp, "").setCreativeTab(Sonos.cTab);//Color HEX int value: ecef01
	public static Sono sono_b = new Sono("sono_b", Notes.B, "").setCreativeTab(Sonos.cTab);       //Color HEX int value: 9eef01

	//Sono Primas
	public static SonoPrima sono_prima_c = new SonoPrima("sono_prima_c", Notes.C).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_cs = new SonoPrima("sono_prima_cs", Notes.CSharp).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_d = new SonoPrima("sono_prima_d", Notes.D).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_ds = new SonoPrima("sono_prima_ds", Notes.DSharp).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_e = new SonoPrima("sono_prima_e", Notes.E).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_f = new SonoPrima("sono_prima_f", Notes.F).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_fs = new SonoPrima("sono_prima_fs", Notes.FSharp).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_g = new SonoPrima("sono_prima_g", Notes.G).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_gs = new SonoPrima("sono_prima_gs", Notes.GSharp).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_a = new SonoPrima("sono_prima_a", Notes.A).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_as = new SonoPrima("sono_prima_as", Notes.ASharp).setCreativeTab(Sonos.cTab);
	public static SonoPrima sono_prima_b = new SonoPrima("sono_prima_b", Notes.B).setCreativeTab(Sonos.cTab);

	//SonoRings
	public static SonoRing cRing = new SonoRing("sonoring_c", Notes.C).setCreativeTab(Sonos.cTab);
	public static SonoRing csRing = new SonoRing("sonoring_cs", Notes.CSharp).setCreativeTab(Sonos.cTab);
	public static SonoRing dRing = new SonoRing("sonoring_d", Notes.D).setCreativeTab(Sonos.cTab);
	public static SonoRing dsRing = new SonoRing("sonoring_ds", Notes.DSharp).setCreativeTab(Sonos.cTab);
	public static SonoRing eRing = new SonoRing("sonoring_e", Notes.E).setCreativeTab(Sonos.cTab);
	public static SonoRing fRing = new SonoRing("sonoring_f", Notes.F).setCreativeTab(Sonos.cTab);
	public static SonoRing fsRing = new SonoRing("sonoring_fs", Notes.FSharp).setCreativeTab(Sonos.cTab);
	public static SonoRing gRing = new SonoRing("sonoring_g", Notes.G).setCreativeTab(Sonos.cTab);
	public static SonoRing gsRing = new SonoRing("sonoring_gs", Notes.GSharp).setCreativeTab(Sonos.cTab);
	public static SonoRing aRing = new SonoRing("sonoring_a", Notes.A).setCreativeTab(Sonos.cTab);
	public static SonoRing asRing = new SonoRing("sonoring_as", Notes.ASharp).setCreativeTab(Sonos.cTab);
	public static SonoRing bRing = new SonoRing("sonoring_b", Notes.B).setCreativeTab(Sonos.cTab);

	//SonoVessel
	public static SonoVessel cVessel = new SonoVessel("sonovessel_c", Notes.C).setCreativeTab(Sonos.cTab);
	public static SonoVessel csVessel = new SonoVessel("sonovessel_cs", Notes.CSharp).setCreativeTab(Sonos.cTab);
	public static SonoVessel dVessel = new SonoVessel("sonovessel_d", Notes.D).setCreativeTab(Sonos.cTab);
	public static SonoVessel dsVessel = new SonoVessel("sonovessel_ds", Notes.DSharp).setCreativeTab(Sonos.cTab);
	public static SonoVessel eVessel = new SonoVessel("sonovessel_e", Notes.E).setCreativeTab(Sonos.cTab);
	public static SonoVessel fVessel = new SonoVessel("sonovessel_f", Notes.F).setCreativeTab(Sonos.cTab);
	public static SonoVessel fsVessel = new SonoVessel("sonovessel_fs", Notes.FSharp).setCreativeTab(Sonos.cTab);
	public static SonoVessel gVessel = new SonoVessel("sonovessel_g", Notes.G).setCreativeTab(Sonos.cTab);
	public static SonoVessel gsVessel = new SonoVessel("sonovessel_gs", Notes.GSharp).setCreativeTab(Sonos.cTab);
	public static SonoVessel aVessel = new SonoVessel("sonovessel_a", Notes.A).setCreativeTab(Sonos.cTab);
	public static SonoVessel asVessel = new SonoVessel("sonovessel_as", Notes.ASharp).setCreativeTab(Sonos.cTab);
	public static SonoVessel bVessel = new SonoVessel("sonovessel_b", Notes.B).setCreativeTab(Sonos.cTab);

	public static void register()
	{
		OrionRegistry.register(
		sono_c, sono_cs, sono_d, sono_ds, sono_e, sono_f, sono_fs, sono_g, sono_gs, sono_a, sono_as, sono_b,
		sono_prima_c, sono_prima_cs, sono_prima_d, sono_prima_ds, sono_prima_e, sono_prima_f, sono_prima_fs, sono_prima_g, sono_prima_gs, sono_prima_a, sono_prima_as, sono_prima_b,
		cRing, csRing, dRing, dsRing, eRing, fRing, fsRing, gRing, gsRing, aRing, asRing, bRing,
		cVessel, csVessel, dVessel, dsVessel, eVessel, fVessel, fsVessel, gVessel, gsVessel, aVessel, asVessel, bVessel
		);
	}

	public static void registerItemColors()
	{
		ItemColors ic = Minecraft.getMinecraft().getItemColors();

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_c, cRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_cs, csRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_d, dRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_ds, dsRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_e, eRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_f, fRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_fs, fsRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_g, gRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_gs, gsRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_a, aRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_as, asRing);

		ic.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? -1 : color_b, bRing);
	}

	public static Sono getSonoFormNote(Notes note)
	{
		switch(note.toString())
		{
			case "C":
        return sono_c;
      case "CSharp":
        return sono_cs;
      case "D":
        return sono_d;
      case "DSharp":
        return sono_ds;
      case "E":
        return sono_e;
      case "F":
        return sono_f;
      case "FSharp":
        return sono_fs;
      case "G":
        return sono_g;
      case "GSharp":
        return sono_gs;
      case "A":
        return sono_a;
      case "ASharp":
        return sono_as;
      case "B":
        return sono_b;
			default:
				return null;
		}
	}

	public static SonoPrima getSonoPrimaFormNote(Notes note)
	{
		switch(note.toString())
		{
			case "C":
				return sono_prima_c;
			case "CSharp":
				return sono_prima_cs;
			case "D":
				return sono_prima_d;
			case "DSharp":
				return sono_prima_ds;
			case "E":
				return sono_prima_e;
			case "F":
				return sono_prima_f;
			case "FSharp":
				return sono_prima_fs;
			case "G":
				return sono_prima_g;
			case "GSharp":
				return sono_prima_gs;
			case "A":
				return sono_prima_a;
			case "ASharp":
				return sono_prima_as;
			case "B":
				return sono_prima_b;
			default:
				return null;
		}
	}

	public static void initOreDictionary()
	{
		OreDictionary.registerOre("sonoOre", SonosBlocks.SO);

		OreDictionary.registerOre("sono", sono_c);
		OreDictionary.registerOre("sono", sono_cs);
		OreDictionary.registerOre("sono", sono_d);
		OreDictionary.registerOre("sono", sono_ds);
		OreDictionary.registerOre("sono", sono_e);
		OreDictionary.registerOre("sono", sono_f);
		OreDictionary.registerOre("sono", sono_fs);
		OreDictionary.registerOre("sono", sono_g);
		OreDictionary.registerOre("sono", sono_gs);
		OreDictionary.registerOre("sono", sono_a);
		OreDictionary.registerOre("sono", sono_as);
		OreDictionary.registerOre("sono", sono_b);
		OreDictionary.registerOre("sono", sono_prima_c);
		OreDictionary.registerOre("sono", sono_prima_cs);
		OreDictionary.registerOre("sono", sono_prima_d);
		OreDictionary.registerOre("sono", sono_prima_ds);
		OreDictionary.registerOre("sono", sono_prima_e);
		OreDictionary.registerOre("sono", sono_prima_f);
		OreDictionary.registerOre("sono", sono_prima_fs);
		OreDictionary.registerOre("sono", sono_prima_g);
		OreDictionary.registerOre("sono", sono_prima_gs);
		OreDictionary.registerOre("sono", sono_prima_a);
		OreDictionary.registerOre("sono", sono_prima_as);
		OreDictionary.registerOre("sono", sono_prima_b);

		OreDictionary.registerOre("rawSono", sono_c);
		OreDictionary.registerOre("rawSono", sono_cs);
		OreDictionary.registerOre("rawSono", sono_d);
		OreDictionary.registerOre("rawSono", sono_ds);
		OreDictionary.registerOre("rawSono", sono_e);
		OreDictionary.registerOre("rawSono", sono_f);
		OreDictionary.registerOre("rawSono", sono_fs);
		OreDictionary.registerOre("rawSono", sono_g);
		OreDictionary.registerOre("rawSono", sono_gs);
		OreDictionary.registerOre("rawSono", sono_a);
		OreDictionary.registerOre("rawSono", sono_as);
		OreDictionary.registerOre("rawSono", sono_b);

		OreDictionary.registerOre("sonoPrima", sono_prima_c);
		OreDictionary.registerOre("sonoPrima", sono_prima_cs);
		OreDictionary.registerOre("sonoPrima", sono_prima_d);
		OreDictionary.registerOre("sonoPrima", sono_prima_ds);
		OreDictionary.registerOre("sonoPrima", sono_prima_e);
		OreDictionary.registerOre("sonoPrima", sono_prima_f);
		OreDictionary.registerOre("sonoPrima", sono_prima_fs);
		OreDictionary.registerOre("sonoPrima", sono_prima_g);
		OreDictionary.registerOre("sonoPrima", sono_prima_gs);
		OreDictionary.registerOre("sonoPrima", sono_prima_a);
		OreDictionary.registerOre("sonoPrima", sono_prima_as);
		OreDictionary.registerOre("sonoPrima", sono_prima_b);

		OreDictionary.registerOre("sonoVessel", cVessel);
		OreDictionary.registerOre("sonoVessel", csVessel);
		OreDictionary.registerOre("sonoVessel", dVessel);
		OreDictionary.registerOre("sonoVessel", dsVessel);
		OreDictionary.registerOre("sonoVessel", eVessel);
		OreDictionary.registerOre("sonoVessel", fVessel);
		OreDictionary.registerOre("sonoVessel", fsVessel);
		OreDictionary.registerOre("sonoVessel", gVessel);
		OreDictionary.registerOre("sonoVessel", gsVessel);
		OreDictionary.registerOre("sonoVessel", aVessel);
		OreDictionary.registerOre("sonoVessel", asVessel);
		OreDictionary.registerOre("sonoVessel", bVessel);
	}
}
