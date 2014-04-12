package com.kirishikistudios.designpattern.command.drawer;

import com.kirishikistudios.designpattern.command.command.Command;

import java.awt.*;

/**
 * @author yamadanaoyuki
 */
public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
