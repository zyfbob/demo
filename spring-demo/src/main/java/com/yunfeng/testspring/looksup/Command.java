package com.yunfeng.testspring.looksup;

import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component("command")
public class Command extends CommandManager{
    private Object state;
  //  private Command s=new Command();
    public Object execute() {

        return "xxx";
    }

    public void setState(Object commandState) {
        this.state=commandState;
    }

    @Override
    protected Command createCommand() {
        return null;
    }
}
