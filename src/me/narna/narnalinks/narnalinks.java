package me.narna.narnalinks;


import java.util.*;

import org.bukkit.command.*;
import org.bukkit.plugin.java.JavaPlugin;
 
 
public class narnalinks extends JavaPlugin {
	
	private String ReplaceColours(String message) {
		return message.replace("(?i)$", "§");
		 }	 

	
    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        
        this.getCommand("site").setExecutor(new CommandExecutor() {
 
            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> site = narnalinks.this.getConfig().getStringList(ReplaceColours("site"));
                for (String s : site)
                    sender.sendMessage(s);
                
                return true;
            }
        
            
        });
        
        this.getCommand("vote").setExecutor(new CommandExecutor() {
        	
        	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> vote = narnalinks.this.getConfig().getStringList(ReplaceColours("vote"));
                for (String s : vote)
                    sender.sendMessage(s);
                
                return true;
            
        
        	}
        });
        
        this.getCommand("donate").setExecutor(new CommandExecutor() {
        	
        	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> donate = narnalinks.this.getConfig().getStringList(ReplaceColours("donate"));
                for (String s : donate)
                    sender.sendMessage(s);
                
                return true;
            
        
        	}
        });
        
        this.getCommand("contact").setExecutor(new CommandExecutor() {
        	
        	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> contact = narnalinks.this.getConfig().getStringList(ReplaceColours("contact"));
                for (String s : contact)
                    sender.sendMessage(s);
                
                return true;
            
        
        	}
        });
        
        this.getCommand("dynmap").setExecutor(new CommandExecutor() {
        	
        	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> dynmap = narnalinks.this.getConfig().getStringList(ReplaceColours("dynmap"));
                for (String s : dynmap)
                    sender.sendMessage(s);
                
                return true;
            
        
        	}
        });
    }
}

