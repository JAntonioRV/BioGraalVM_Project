package com.msc.graalvmcontext;

import io.micronaut.core.annotation.Introspected;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.HostAccess;
import org.graalvm.polyglot.PolyglotAccess;

@Introspected
public class GraalVMContext {
	private static Context uniqueContextInstance;

	private GraalVMContext() { }

	public static Context getInstance() {
		if(uniqueContextInstance == null){
			try{
				Context context = Context
						.newBuilder()
						.allowAllAccess(true)
						.allowNativeAccess(true)
						.allowPolyglotAccess(PolyglotAccess.ALL)
						.allowHostAccess(HostAccess.ALL)
						.allowIO(true)
                        .option("python.SysPrefix", "/opt/graalvm-ce-java8-20.3.0/jre/languages/python")
                        .option("python.CoreHome", "/opt/graalvm-ce-java8-20.3.0/jre/languages/python/lib-graalpython")
                        .option("python.StdLibHome", "/opt/graalvm-ce-java8-20.3.0/jre/languages/python/lib-python/3")
                        .option("python.Executable", "/opt/graalvm-ce-java8-20.3.0/jre/languages/python/bin/graalpython")
                        .option("python.CAPI", "/opt/graalvm-ce-java8-20.3.0/jre/languages/python/lib-graalpython")
						.build();
				uniqueContextInstance = context;
			}
			catch (Exception ex){
				ex.printStackTrace();
				throw  ex;
			}
		}
		return uniqueContextInstance;
	}
}