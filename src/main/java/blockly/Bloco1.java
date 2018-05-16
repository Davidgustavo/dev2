package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco1 {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Bloco1
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),
						cronapi.object.Operations.newObject(Var.valueOf("app.entity.User"),
								Var.valueOf("id", cronapi.util.Operations.generateUUID()),
								Var.valueOf("email", Var.valueOf("rodrigo.reis@cronapp.io")),
								Var.valueOf("name", Var.valueOf("rodrigo.reis@cronapp.io")),
								Var.valueOf("login", Var.valueOf("rodrigo.reis@cronapp.io")),
								Var.valueOf("password", Var.valueOf("1234"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
