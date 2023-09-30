package events.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class embedCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String[] message = e.getMessage().getContentRaw().split(" ");
        if (message[0].equalsIgnoreCase("best") && message[1].equalsIgnoreCase("deck")) {
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("Dino is the best deck");
            eb.setImage("https://i.pinimg.com/736x/5f/c3/40/5fc34033c1448eb61150d12d52d06984.jpg");
            eb.setThumbnail("https://i.pinimg.com/736x/5f/c3/40/5fc34033c1448eb61150d12d52d06984.jpg");
            eb.setColor(java.awt.Color.getColor("10", Color.cyan));
            eb.setDescription("Just checking what this does");
            eb.addField("Deck information", "Dino decks, including scrap dino decks, are the best decks," +
                    " just testing how long i can let this go on for" +
                    "because it's pretty awesome, don't you think? ", true);
            e.getChannel().sendMessageEmbeds(eb.build()).queue();
        }
    }
}
