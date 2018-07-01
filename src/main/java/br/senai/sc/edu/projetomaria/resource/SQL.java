package br.senai.sc.edu.projetomaria.resource;

public abstract class SQL {

	// ....
	public static final String GET_CANAL ;
	
	public static final String INSERT_CANAL ;

	public static final String UPDATE_CANAL ;

	public static final String DELETE_CANAL;
	
	public static final String HISTORICO_SELECT;

	public static final String HISTORICO_INSERT;

	public static final String HISTORICO_UPDATE;

	public static final String HISTORICO_DELETE;

	public static final String INSERT_FAMILIA ;

	public static final String UPDATE_FAMILIA ;

	public static final String DELETE_FAMILIA;

	static {

		HISTORICO_SELECT = ResourceManager.getSQL("historico.select"); //$NON-NLS-1$
		HISTORICO_INSERT = ResourceManager.getSQL("historico.insert"); //$NON-NLS-1$
		HISTORICO_UPDATE = ResourceManager.getSQL("historico.update"); //$NON-NLS-1$
		HISTORICO_DELETE = ResourceManager.getSQL("historico.delete"); //$NON-NLS-1$
		GET_CANAL = ResourceManager.getSQL("sql.get.todos.canal"); //$NON-NLS-1$
		INSERT_CANAL = ResourceManager.getSQL ("sql.insert.canal"); //$NON-NLS-1$
		UPDATE_CANAL = ResourceManager.getSQL ("sql.update.canal"); //$NON-NLS-1$
		DELETE_CANAL = ResourceManager.getSQL("sql.delete.canal"); //$NON-NLS-1$
		INSERT_FAMILIA = ResourceManager.getSQL("sql.insert.familia"); //$NON-NLS-1$
		UPDATE_FAMILIA = ResourceManager.getSQL("sql.update.familia"); //$NON-NLS-1$
		DELETE_FAMILIA = ResourceManager.getSQL("sql.delete.familia"); //$NON-NLS-1$
	}

	private SQL() {

	}

}



