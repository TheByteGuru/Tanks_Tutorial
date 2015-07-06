package com.thebyteguru.display;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class Display {

	private static boolean created = false;
	private static JFrame window;
	private static Canvas content;

	public static void create(int width, int height, String title) {

		if (created)
			return;

		window = new JFrame(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content = new Canvas() {

			public void paint(Graphics g) {
				super.paint(g);
				render(g);
			}

		};

		Dimension size = new Dimension(width, height);
		content.setPreferredSize(size);
		content.setBackground(Color.black);

		window.setResizable(false);
		window.getContentPane().add(content);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

	public static void render() {
		content.repaint();
	}

	private static void render(Graphics g) {

		g.setColor(Color.white);
		g.fillOval(400 - 50, 300 - 50, 100, 100);

	}

}
