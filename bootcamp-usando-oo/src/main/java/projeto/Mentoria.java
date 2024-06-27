package projeto;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /*@Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }*/

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mentoria { ");
        stringBuilder.append("Título: ").append(getTitulo()).append(", ");
        stringBuilder.append("Descrição: ").append(getDescricao()).append(", ");
        stringBuilder.append("Data: ").append(data);
        stringBuilder.append(" }\n");
        return stringBuilder.toString();
    }

}
