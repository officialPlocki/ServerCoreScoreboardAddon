/*    */ package org.ehrengames.scoreboardaddon.utils;
/*    */ import de.plocki.commands.CMD_vanish;
/*    */ import de.plocki.main.Settings;
/*    */ import de.plocki.utils.EconomyUtils;
/*    */ import java.text.DecimalFormat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ScoreboardManager
/*    */ {
/* 21 */   private static final String name = Bukkit.getServer().getClass().getPackage().getName();
/*    */   
/*    */   public static void setScoreBoard(Player p) {
/* 26 */     Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
/* 27 */     Objective obj = board.registerNewObjective("aaa", "bbb");
/* 28 */     obj.setDisplaySlot(DisplaySlot.SIDEBAR);
/*    */     
/* 30 */     obj.setDisplayName("§c§lLarsodersaas");
/*    */     
/* 32 */     if (p.hasPermission(String.valueOf(Settings.permissionprefix) + ".scoreboard.adminoptions")) {
/* 35 */       obj.getScore("§1").setScore(12);
/* 36 */       obj.getScore("§cServer").setScore(11);
/* 37 */       obj.getScore("§8» §7" + Bukkit.getServer().getMotd()).setScore(10);
/* 38 */       obj.getScore("§2").setScore(9);
/* 39 */       obj.getScore("§cSpieler").setScore(8);
/* 40 */       obj.getScore("§8» §7 " + String.valueOf(Bukkit.getOnlinePlayers().size() - CMD_vanish.vanished.size()) + "/" + Bukkit.getMaxPlayers()).setScore(7);
/* 41 */       obj.getScore("§3").setScore(6);
/* 42 */       obj.getScore("§cKonto").setScore(5);
/* 43 */       obj.getScore("§8» §7" + EconomyUtils.getCoins(p) + Settings.value).setScore(4);
/* 44 */       obj.getScore("§5").setScore(3);
/* 45 */       obj.getScore("§cRAM").setScore(2);
/* 46 */       long i = Runtime.getRuntime().maxMemory() / 1048576L;
/* 47 */       long i2 = Runtime.getRuntime().freeMemory() / 1048576L;
/* 48 */       obj.getScore("§8» §7" + String.valueOf(i - i2) + "/" + i).setScore(1);
/* 49 */       obj.getScore("§6").setScore(0);
/* 50 */       p.setScoreboard(board);
/*    */       return;
/*    */     } 
/* 53 */     ByteArrayDataOutput out = ByteStreams.newDataOutput();
/* 54 */     out.writeUTF("GetServer");
/*    */     
/* 56 */     obj.getScore("§1").setScore(9);
/* 57 */     obj.getScore("§cServer").setScore(8);
/* 58 */     obj.getScore("§8» §7" + Bukkit.getServer().getMotd()).setScore(7);
/* 59 */     obj.getScore("§2").setScore(6);
/* 60 */     obj.getScore("§cSpieler").setScore(5);
/* 61 */     obj.getScore("§8» §7" + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getMaxPlayers()).setScore(4);
/* 62 */     obj.getScore("§3").setScore(3);
/* 63 */     obj.getScore("§cKonto").setScore(2);
/* 64 */     obj.getScore("§8» §7" + EconomyUtils.getCoins(p) + Settings.value).setScore(1);
/* 65 */     obj.getScore("§4").setScore(0);
/* 66 */     p.setScoreboard(board);
/*    */   }
/*    */ }


/* Location:              /home/plocki/Downloads/ScoreboardAddon.jar!/org/ehrengames/scoreboardaddon/utils/ScoreboardManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */