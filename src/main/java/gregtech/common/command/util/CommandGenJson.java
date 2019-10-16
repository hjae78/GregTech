package gregtech.common.command.util;

import gregtech.api.util.MTJsonGenerator;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

import java.io.IOException;

public class CommandGenJson extends CommandBase {


    @Override
    public String getName() {
        return "genjson";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "gregtech.command.util.genjson.usage";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

        try {
            MTJsonGenerator.main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
