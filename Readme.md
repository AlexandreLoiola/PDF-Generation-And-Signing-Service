# Serviço de Geração e Assinatura de PDFs

## Visão Geral
O Serviço de Geração e Assinatura de PDFs foi projetado para criar e manipular documentos PDF de forma dinâmica. Este sistema permite que os usuários gerem documentos personalizados, como certificados ou contratos, com base em templates e apliquem assinaturas eletrônicas em PDFs existentes a fim de validar a sua autenticidade.

## Funcionalidades

1. **Gerar PDF com Template Personalizado:** Permitir ao usuário criar um documento PDF a partir de um template predefinido, com a possibilidade de personalizar o conteúdo, como inserção de dados do usuário (ex: nome, data, etc.).


2. **Aplicar Assinatura Eletrônica em Documento PDF:** Permitir ao usuário aplicar uma assinatura eletrônica em um documento PDF para validá-lo e garantir sua autenticidade.


3. **Visualizar PDF Gerado:** Permitir ao usuário visualizar o PDF gerado ou assinado antes de realizar o download, garantindo que o documento esteja conforme esperado.


4. **Fazer Download de PDF Gerado:** Permitir ao usuário fazer o download de um PDF gerado ou assinado para armazenamento ou distribuição.


5. **Verificar a Validade da Assinatura Eletrônica:** Permitir ao usuário verificar se a assinatura eletrônica em um PDF é válida e se o documento não foi alterado após a assinatura.

# Modelagem Lógica de Dados

1. **Template:** Armazena os templates de PDF disponíveis para geração de documentos personalizados.


2. **Document:** Armazena os documentos gerados a partir de templates ou documentos enviados para assinatura.


3. **Usuario:** Armazena informações sobre os usuários do sistema (quem gera os documentos e aplica as assinaturas).


4. **Signature:** Armazena informações sobre as assinaturas eletrônicas aplicadas aos documentos.


5. **Document Edit History:** Armazena um histórico das edições feitas em um documento, seja na geração ou na aplicação de assinaturas.