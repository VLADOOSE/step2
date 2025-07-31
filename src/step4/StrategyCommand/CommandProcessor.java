package step4.StrategyCommand;
import step4.StrategyCommand.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProcessor {
    public HashMap<String, Command> map = new HashMap<>();
    public CommandProcessor(){
        this.map.put("start", new StartCommand());
        this.map.put("stop", new StopCommand());
        this.map.put("pause", new PauseCommand());
    }
    public void process(String commandKey){
        if(!this.map.containsKey(commandKey)){
            System.out.println("Unknown command");
        }else {
            Command command = this.map.get(commandKey);
            command.execute();
        }

    }
}
