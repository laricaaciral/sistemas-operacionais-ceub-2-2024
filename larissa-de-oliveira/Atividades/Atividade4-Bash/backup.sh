echo "Data e Hora atuais: $(date)"
echo "Usuário logado: $(whoami)"
echo "Diretório atual: $(pwd)"
echo "Espaço livre no disco: $(df -h / | grep / | awk '{print $4}')"
