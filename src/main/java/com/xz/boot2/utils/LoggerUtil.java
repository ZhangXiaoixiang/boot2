
package com.xz.boot2.utils;

import org.apache.log4j.Logger;

import java.text.MessageFormat;


/**
 * @author fengxing.yu
 *
 */
public class LoggerUtil {


	/**
	 * 生成trace的模板
	 * 
	 * @param template
	 * @param parameters
	 * @return
	 */
	public static String getMessage(String template, Object... parameters) {

		return  MessageFormat.format(template, parameters);
	}
	
	public static Object getMessage(Class<?> clazz, String template, Object[] parameters) {
        // TODO Auto-generated method stub
        return clazz.getName()+" "+MessageFormat.format(template, parameters);
    }

	/**
	 * <p>
	 * 生成调试级别日志
	 * </p>
	 * <p>
	 * 根据带参数的日志模板和参数集合，生成debug级别日志
	 * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
	 * </p>
	 *
	 * @param logger
	 *            logger引用
	 * @param template
	 *            带参数的日志模板
	 * @param parameters
	 *            参数集合
	 */
	public static void debug(Logger logger, String template, Object... parameters) {
		if (logger.isDebugEnabled()) {
			logger.debug(getMessage(template, parameters));
		}
	}
	
	public static void debug(Logger logger, Class<?> clazz, String template, Object... parameters) {
        if (logger.isDebugEnabled()) {
            logger.debug(getMessage(clazz,template, parameters));
        }
    }

	/**
	 * <p>
	 * 生成调试级别日志
	 * </p>
	 * <p>
	 * 根据带参数的日志模板和参数集合，生成info级别日志
	 * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
	 * </p>
	 *
	 * @param logger
	 *            logger引用
	 * @param template
	 *            带参数的日志模板
	 * @param parameters
	 *            参数集合
	 */
	public static void info(Logger logger, Class<?> clazz, String template, Object... parameters) {
		if (logger.isInfoEnabled()) {
			logger.info(getMessage(clazz,template, parameters));
		}
	}
	public static void info(Logger logger, String template, Object... parameters) {
        if (logger.isInfoEnabled()) {
            logger.info(getMessage(template, parameters));
        }
    }
	

    /**
	 * <p>
	 * 生成调试级别日志
	 * </p>
	 * <p>
	 * 根据带参数的日志模板和参数集合，生成warn级别日志
	 * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
	 * </p>
	 *
	 * @param logger
	 *            logger引用
	 * @param template
	 *            带参数的日志模板
	 * @param parameters
	 *            参数集合
	 */
	public static void warn(Logger logger, String template, Object... parameters) {
		logger.warn(getMessage(template, parameters));
	}
	public static void warn(Logger logger, Class<?> clazz, String template, Object... parameters) {
        logger.warn(getMessage(clazz,template, parameters));
    }

	/**
	 * <p>
	 * 生成调试级别日志
	 * </p>
	 * <p>
	 * 根据带参数的日志模板和参数集合，生成error级别日志
	 * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
	 * </p>
	 *
	 * @param logger
	 *            logger引用
	 * @param template
	 *            带参数的日志模板
	 * @param parameters
	 *            参数集合
	 */
	public static void error(Logger logger, String template, Object... parameters) {
		logger.error(getMessage(template, parameters));
	}
	public static void error(Logger logger, Class<?> clazz, String template, Object... parameters) {
        logger.error(getMessage(clazz,template, parameters));
    }

	/**
	 * <p>
	 * exception日志
	 * </p>
	 * <p>
	 * 根据带参数的日志模板和参数集合，生成warn级别日志
	 * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
	 * </p>
	 *
	 * @param logger
	 *            logger引用
	 * @param template
	 *            带参数的日志模板
	 * @param parameters
	 *            参数集合
	 */
	public static void warn(Throwable e, Logger logger, String template, Object... parameters) {
		logger.warn(getMessage(template, parameters), e);
	}
	public static void warn(Throwable e, Logger logger, Class<?> clazz, String template, Object... parameters) {
        logger.warn(getMessage(clazz,template, parameters), e);
    }

	/**
	 * <p>
	 * exception日志
	 * </p>
	 * <p>
	 * 根据带参数的日志模板和参数集合，生成error级别日志
	 * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
	 * </p>
	 *
	 * @param logger
	 *            logger引用
	 * @param template
	 *            带参数的日志模板
	 * @param parameters
	 *            参数集合
	 */
	public static void error(Throwable e, Logger logger, String template, Object... parameters) {
		logger.error(getMessage(template, parameters), e);
	}
	public static void error(Throwable e, Logger logger, Class<?> clazz, String template, Object... parameters) {
        logger.error(getMessage(clazz,template, parameters), e);
    }

	
}
