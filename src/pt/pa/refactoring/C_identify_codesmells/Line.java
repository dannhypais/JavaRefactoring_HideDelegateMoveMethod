package pt.pa.refactoring.C_identify_codesmells;

public class Line {
    private final Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void move(int dx, int dy) {
        start.move(dx, dy);
        end.move(dx, dy);
    }

    public int getStartX() {
        return start.getX();
    }

    public int getStartY() {
        return start.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public boolean contains(Point point){
        return start.equals(point) || end.equals(point);
    }

    @Override
    public String toString() {
        return String.format("%s --> %s", start, end);
    }
}
