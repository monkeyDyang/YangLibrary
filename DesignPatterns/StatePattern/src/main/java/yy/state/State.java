package yy.state;

import yy.context.Context;

public interface State {
    void doAction(Context context);
}
