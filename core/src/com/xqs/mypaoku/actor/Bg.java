package com.xqs.mypaoku.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.xqs.mypaoku.MyPaokuGame;
import com.xqs.mypaoku.actor.base.BaseImageActor;

/**
 * Created by Administrator on 2017/1/15 0015.
 */

public class Bg extends BaseImageActor {

    public static String PICTURE_BG="images/bg01.png";

    private Texture texture;
    private TextureRegion region;


    public Bg(MyPaokuGame mainGame) {
        super(mainGame);

        texture = new Texture(Gdx.files.internal(PICTURE_BG));

        region=new TextureRegion(texture);

        setRegion(region);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }



}
