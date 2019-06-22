package ru.fratask.mc.plugin.autoitemtrasher.main;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id ="auto-item-trasher")
public class AutoItemTrasher {

    @Inject
    Logger logger;
    

    @Listener
    public void onServerStart(GameInitializationEvent event){
        logger.info("AutoItemTrasher is loaded");
    }

}
