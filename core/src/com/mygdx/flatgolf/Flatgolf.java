package com.mygdx.flatgolf;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Flatgolf extends Game {
	SpriteBatch batch;

	public void create () {
		batch = new SpriteBatch();
	}

	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.end();
	}

	public void dispose () {
		batch.dispose();
	}
}
