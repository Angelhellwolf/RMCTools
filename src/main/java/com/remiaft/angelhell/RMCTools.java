package com.remiaft.angelhell;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RMCTools extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(new String[] {
                getPrefix() + "§a插件已加载",
                "§a作者: §eAngelHell"
                });
    }
    public static String getPrefix(){
        return "§a[RMCTools] §e";
    }
    //这只是一个实验性内容，这个东西的目的是让我练习 IDEA Minecraft plugin 和 GitHub 的使用

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(new String[] {
                getPrefix() + "§c插件已卸载",
                "§a作者: §eAngelHell"
        });
    }
}
