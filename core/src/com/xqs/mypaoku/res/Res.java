package com.xqs.mypaoku.res;

/**
 * 资源常量
 *
 */
public class Res {

    /** 世界宽高 */
    public static final float FIX_WORLD_HEIGHT=720;
    public static final float FIX_WORLD_WIDTH=1280;

    /** 帧率显示所需要的位图字体 文件路径 */
    public static final String FPS_BITMAP_FONT_PATH = "fps/fps24px.fnt";

    /**
     * 相关物理参数（调节物理参数可改变游戏难度）
     */
    public static class Physics {

        /** 水管和地板的移动速度, 单位: px/s */
        public static final float MOVE_VELOCITY = -150.0F;
    }

    /**
     * 纹理图集
     */
    public static class Atlas {

        /** 纹理图集 文件路径 */
        public static final String ATLAS_PATH = "atlas/images.atlas";

        /* 纹理图集中的小图名称 */


        public static final String IMAGE_PLAYER_SHOOT="player_shoot";

        public static final String IMAGE_ENEMY = "enemy";

        /** 子弹 **/
        public static final String IMAGE_BULLET_ONE_FLY="bullet_one_fly";
        public static final String IMAGE_BULLET_ONE_EXPLODE="bullet_one_explode";

        public static final String IMAGE_BULLET_TWO_FLY="bullet_two_fly";
        public static final String IMAGE_BULLET_TWO_EXPLODE="bullet_two_explode";

        public static final String IMAGE_BULLET_THREE_FlY="bullet_three_fly";
        public static final String IMAGE_BULLET_THREE_EXPLODE="bullet_three_explode";

        /** 大葱 **/
        public static final String IMAGE_ENEMY_DACONG_WALK="dacong_walk";
        public static final String IMAGE_ENEMY_DACONG_DEAD="dacong_dead";


        /** 菜花 **/
        public static final String IMAGE_ENEMY_CAIHUA_WALK="caihua_walk";
        public static final String IMAGE_ENEMY_CAIHUA_DEAD="caihua_dead";

        /** 木薯 **/
        public static final String IMAGE_ENEMY_MUSHU_WALK="mushu_walk";
        public static final String IMAGE_ENEMY_MUSHU_FIRE="mushu_fire";
        public static final String IMAGE_ENEMY_MUSHU_DEAD="mushu_dead";


        /** 飞机 **/
        public static final String IMAGE_ENEMY_PLANE_WALK="plane_walk";
        public static final String IMAGE_ENEMY_PLANE_FIRE="plane_fire";
        public static final String IMAGE_ENEMY_PLANE_DEAD="plane_dead";


        public static final String IMAGE_ENEMY_DEAD="enemy_dead";

        public static final String IMAGE_BULLET="bullet";

        public static final String IMAGE_BULLET_2="bullet2";
    }


}




















