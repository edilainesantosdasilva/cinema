class Cinema (
    private val nome: String,
    private val horarioDeAbertura: Byte,
    private val horarioDeFechamento:Byte,
        ) {
    private var assentos = mutableListOf<Assento>()
    private var filmes = mutableListOf<Filme>()

    fun adicionarNovoFilme(filme: Filme): Boolean = filmes.add(filme)

    fun listarTodosOsFilmes() = filmes

    fun cadrastrarAssento(assento: Assento): Boolean = assentos.add(assento)

    fun listarAssentos() = assentos
}