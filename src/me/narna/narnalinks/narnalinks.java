package me.narna.narnalinks;


import java.util.*;
import org.bukkit.command.*;
import org.bukkit.plugin.java.JavaPlugin;
 
 
public class narnalinks extends JavaPlugin {
	
 
    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        
        this.getCommand("site").setExecutor(new CommandExecutor() {
 
            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> site = narnalinks.this.getConfig().getStringList("site");
                for (String s : site)
                    sender.sendMessage(s);
                
                return true;
            }
        
            
        });
        
        this.getCommand("vote").setExecutor(new CommandExecutor() {
        	
        	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> vote = narnalinks.this.getConfig().getStringList("vote");
                for (String s : vote)
                    sender.sendMessage(s);
                
                return true;
            
        
        	}
        });
        
        this.getCommand("donate").setExecutor(new CommandExecutor() {
        	
        	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> donate = narnalinks.this.getConfig().getStringList("donate");
                for (String s : donate)
                    sender.sendMessage(s);
                
                return true;
            
        
        	}
        });
        
        this.getCommand("contact").setExecutor(new CommandExecutor() {
        	
        	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> contact = narnalinks.this.getConfig().getStringList("contact");
                for (String s : contact)
                    sender.sendMessage(s);
                
                return true;
            
        
        	}
        });
        
        this.getCommand("dynmap").setExecutor(new CommandExecutor() {
        	
        	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                List<String> dynmap = narnalinks.this.getConfig().getStringList("dynmap");
                for (String s : dynmap)
                    sender.sendMessage(s);
                
                return true;
            
        
        	}
        });
    }
}

