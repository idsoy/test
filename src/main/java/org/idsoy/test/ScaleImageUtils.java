package org.idsoy.test;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import com.sun.image.codec.jpeg.ImageFormatException;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
  
/**
 * <b>function:</b> 缩放图片工具类，创建缩略图、伸缩图片比例
 * @author hoojo
 * @createDate 2012-2-3 上午10:08:47
 * @file ScaleImageUtils.java
 * @package com.hoo.util
 * @version 1.0
 */
public class ScaleImageUtils {
  
    private static final float DEFAULT_SCALE_QUALITY = 1f;
    private static final String DEFAULT_IMAGE_FORMAT = ".jpg"; // 图像文件的格式 
    private static final String DEFAULT_FILE_PATH = "D:/temp-";
     
    public static void main(String[] args) {
		
	}
    
    /**
     * <b>function:</b> 设置图片压缩质量枚举类；
     * Some guidelines: 0.75 high quality、0.5  medium quality、0.25 low quality
     * @author hoojo
     * @createDate 2012-2-7 上午11:31:45
     * @file ScaleImageUtils.java
     * @package com.hoo.util
     * @project JQueryMobile
     * @version 1.0
     */
    public enum ImageQuality {
        max(1.0f), high(0.75f), medium(0.5f), low(0.25f);
         
        private Float quality;
        public Float getQuality() {
            return this.quality;
        }
        ImageQuality(Float quality) {
            this.quality = quality;
        }
    }
     
    private static Image image;
     
    /**
     * <b>function:</b> 通过目标对象的大小和标准（指定）大小计算出图片缩小的比例
     * @author hoojo
     * @createDate 2012-2-6 下午04:41:48
     * @param targetWidth 目标的宽度
     * @param targetHeight 目标的高度
     * @param standardWidth 标准（指定）宽度
     * @param standardHeight 标准（指定）高度
     * @return 最小的合适比例
     */
    public static double getScaling(double targetWidth, double targetHeight, double standardWidth, double standardHeight) {
        double widthScaling = 0d;
        double heightScaling = 0d;
        if (targetWidth > standardWidth) {
            widthScaling = standardWidth / (targetWidth * 1.00d);
        } else {
            widthScaling = 1d;
        }
        if (targetHeight > standardHeight) {
            heightScaling = standardHeight / (targetHeight * 1.00d);
        } else {
            heightScaling = 1d;
        }
        return Math.min(widthScaling, heightScaling);
    }
}