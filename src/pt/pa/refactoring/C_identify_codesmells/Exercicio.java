package pt.pa.refactoring.C_identify_codesmells;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {/*
    public class Main {
        public static void main(String[] args) {
            Figure figure = new Figure();

            figure.addLine(new Line(new Point(1,2),new Point(0,0)));
            figure.addLine(new Line(new Point(0,0),new Point(-1,-2)));
            figure.addLine(new Line(new Point(0,0),new Point(7,3)));

            System.out.println("Figure: "+ figure);

            figure.move(5, 2);

            System.out.println("Figure: "+ figure);
        }
    }
    public class Figure {

        private final List<Line> lines;

        public Figure() {
            lines = new ArrayList<>();
        }

        public void addLine(Line line) {
            lines.add(line);
        }

        public void move(int dx, int dy) {
            for (Line l : lines) {
                l.getStart().setX(l.getStart().getX()+dx);
                l.getStart().setY(l.getStart().getY()+dy);
                l.getEnd().setX(l.getEnd().getX()+dx);
                l.getEnd().setY(l.getEnd().getY()+dy);
            }
        }

        public boolean contains(Point point) {

            for (Line l : lines) {
                if ( l.getStart().getX() == point.getX() && l.getStart().getY() == point.getY() )
                    return true;
                if ( l.getEnd().getX() == point.getX() && l.getEnd().getY() == point.getY() )
                    return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "<" + lines + '>';
        }
    }
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

        @Override
        public String toString() {
            return String.format("%s --> %s", start, end);
        }
    }
    public class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", x, y);
        }
    }*/
}
