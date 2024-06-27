package projeto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    /*@Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }*/

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Curso { ");
        stringBuilder.append("Título: ").append(getTitulo()).append(", ");
        stringBuilder.append("Descrição: ").append(getDescricao()).append(", ");
        stringBuilder.append("Carga Horária: ").append(cargaHoraria);
        stringBuilder.append(" }\n");
        return stringBuilder.toString();
    }

}
