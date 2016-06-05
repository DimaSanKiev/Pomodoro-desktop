package model;

public class Attempt {
    private String mMessage;
    private int mRemainingSeconds;
    private AttemptKind mKind;

    public Attempt(AttemptKind kind, String message) {
        mKind = kind;
        mMessage = message;
        mRemainingSeconds = kind.getmTotalSeconds();
    }

    public String getmMessage() {
        return mMessage;
    }

    public int getmRemainingSeconds() {
        return mRemainingSeconds;
    }

    public AttemptKind getmKind() {
        return mKind;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }
}
