public abstract class Topuklu extends Business{
    public int topukBoyu;
    public abstract void topukBoyuKac(int topukBoyu);

    public int getTopukBoyu() {
        return topukBoyu;
    }

    public void setTopukBoyu(int topukBoyu) {
        this.topukBoyu = topukBoyu;
    }

    @Override
    public String toString() {
        return "Topuklu{" +
                "topukBoyu=" + topukBoyu +
                "} " + super.toString();
    }
}
