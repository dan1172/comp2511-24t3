package youtube2.state;

import youtube2.Viewing;

public class LockedState extends ViewingState {
    public LockedState(Viewing viewing) {
        super(viewing);
    }

    @Override
    public String onLock() {
        if (getViewing().isPlaying()) {
            getViewing().changeState(new PlayingState(getViewing()));
        } else {
            getViewing().changeState(new ReadyState(getViewing()));
        }
        return "Unlocked.";
    }

    @Override
    public String onPlay() {
        return "Error: Locked";
    }

    @Override
    public String onNext() {
        return "Error: Locked";
    }
}
