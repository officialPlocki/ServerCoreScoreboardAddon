/*    */ package org.ehrengames.scoreboardaddon.main;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ import org.ehrengames.scoreboardaddon.utils.ScoreboardManager;
/*    */ 
/*    */ public class Main
/*    */   extends JavaPlugin {
/*    */   public void onEnable() {
/* 12 */     startTimer();
/*    */   }
/*    */   
/*    */   public void startTimer() {
/* 16 */     Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin)this, new Runnable()
/*    */         {
/*    */           public void run()
/*    */           {
/* 20 */             for (Player p : Bukkit.getOnlinePlayers()) {
/* 21 */               ScoreboardManager.setScoreBoard(p);
/*    */             }
/*    */           }
/* 24 */         },  100L, 100L);
/*    */   }
/*    */ }


/* Location:              /home/plocki/Downloads/ScoreboardAddon.jar!/org/ehrengames/scoreboardaddon/main/Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */