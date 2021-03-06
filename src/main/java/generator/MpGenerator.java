package generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MpGenerator {

	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();

		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("C:\\Users\\sizho\\Documents\\MyWorkSpace\\single-pro\\src\\main\\java");
		gc.setFileOverride(true);
		gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
		gc.setEnableCache(true);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(false);// XML columList
		gc.setAuthor("SiZhongxia");

		// 自定义文件命名，注意 %s 会自动填充表实体属性！
		gc.setMapperName("%sDao");
		gc.setXmlName("%sMapper");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setTypeConvert(new MySqlTypeConvert() {
			@Override
			public DbColumnType processTypeConvert(String fieldType) {
				return super.processTypeConvert(fieldType);
			}
		});
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("123456");
		dsc.setUrl("jdbc:mysql://127.0.0.1:3306/single_pro_db?characterEncoding=utf8");
		mpg.setDataSource(dsc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		strategy.setTablePrefix(new String[] { "sp_" });// 此处可以修改为您的表前缀
		strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
		strategy.setInclude(new String[] { "sp_job", "sp_job_group" }); // 需要生成的表
		// strategy.setExclude(new String[] { "" }); // 排除生成的表
		// 自定义实体，公共字段
		strategy.setSuperEntityColumns(new String[] {});
		mpg.setStrategy(strategy);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.single.pro");
		pc.setEntity("entity");
		pc.setMapper("mapper");
		pc.setService("service");
		pc.setServiceImpl("service.impl");
		pc.setXml("mybatis.xml");
		pc.setController("web");

		mpg.setPackageInfo(pc);

		// 执行生成
		mpg.execute();
	}
}
