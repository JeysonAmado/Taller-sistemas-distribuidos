const axios = require('axios');
const express = require('express');
const app = express();

const PORT = 3000;

app.get('/', async (req, res) => {
  try {
    const response = await axios.get('https://drive.google.com/uc?id=1lQi51zJOjWJzvI9FQ44GeibCKE2t_J9K&export=download', {
      responseType: 'text'
    });
    
    res.send(response.data);
  } catch (err) {
    console.error(err);
    res.status(500).send('Error interno del servidor');
  }
});

app.listen(PORT, () => {
  console.log('Servidor iniciado en ' + PORT);
});
